package OCP17.chapter10;


import java.util.Optional;

public class Option {
    public static void main(String[] args) {
        Optional<Double> a = average();

        System.out.println(Double.parseDouble(" 23123.5555555555555"));

        String[] s  = "33.526, 33.5261, 33.5262, 33.5263, 33.5264, 33.5265, 33.5266, 33.5267, 33.5268, 33.5269, 33.527, 33.5271, 33.5272, 33.5273, 33.5274, 33.5275, 33.5276, 33.5277, 33.5278, 33.5279, 33.528, 33.5281, 33.5282, 33.5283, 33.5284, 33.5285, 33.5286, 33.5287, 33.5288, 33.5289, 33.529, 33.5291, 33.5292, 33.5293, 33.5294, 33.5295, 33.5296, 33.5297, 33.5298, 33.5299, 33.53, 33.5301, 33.5302, 33.5303, 33.5304, 33.5305, 33.5306, 33.5307, 33.5308, 33.5309, 33.531, 33.5311, 33.5312, 33.5313, 33.5314, 33.5315, 33.5316, 33.5317, 33.5318, 33.5319, 33.532, 33.5321, 33.5322, 33.5323, 33.5324, 33.5325, 33.5326, 33.5327, 33.5328, 33.5329, 33.533, 33.5331, 33.5332, 33.5333, 33.5334, 33.5335, 33.5336, 33.5337, 33.5338, 33.5339, 33.534, 33.5341, 33.5342, 33.5343, 33.5344, 33.5345, 33.5346, 33.5347, 33.5348, 33.5349, 33.535, 33.5351, 33.5352, 33.5353, 33.5354, 33.5355, 33.5356, 33.5357, 33.5358, 33.5359, 33.536, 33.5361, 33.5362, 33.5363, 33.5364, 33.5365, 33.5366, 33.5367, 33.5368, 33.5369, 33.537, 33.5371, 33.5372, 33.5373, 33.5374, 33.5375, 33.5376, 33.5377, 33.5378, 33.5379, 33.538, 33.5381, 33.5382, 33.5383, 33.5384, 33.5385, 33.5386, 33.5387, 33.5388, 33.5389, 33.539, 33.5391, 33.5392, 33.5393, 33.5394, 33.5395, 33.5396, 33.5397, 33.5398, 33.5399, 33.54, 33.5401, 33.5402, 33.5403, 33.5404, 33.5405, 33.5406, 33.5407, 33.5408, 33.5409, 33.541, 33.5411, 33.5412, 33.5413, 33.5414, 33.5415, 33.5416, 33.5417, 33.5418, 33.5419, 33.542, 33.5421, 33.5422, 33.5423, 33.5424, 33.5425, 33.5426, 33.5427, 33.5428, 33.5429, 33.543, 33.5431, 33.5432, 33.5433, 33.5434, 33.5435, 33.5436, 33.5437, 33.5438, 33.5439, 33.544, 33.5441, 33.5442, 33.5443, 33.5444, 33.5445, 33.5446, 33.5447, 33.5448, 33.5449, 33.545, 33.5451, 33.5452, 33.5453, 33.5454, 33.5455, 33.5456, 33.5457, 33.5458, 33.5459, 33.546, 33.5461, 33.5462, 33.5463, 33.5464, 33.5465, 33.5466, 33.5467, 33.5468, 33.5469, 33.547, 33.5471, 33.5472, 33.5473, 33.5474, 33.5475, 33.5476, 33.5477, 33.5478, 33.5479, 33.548, 33.5481, 33.5482, 33.5483, 33.5484, 33.5485, 33.5486, 33.5487, 33.5488, 33.5489, 33.549, 33.5491, 33.5492, 33.5493, 33.5494, 33.5495, 33.5496, 33.5497, 33.5498, 33.5499, 33.55, 33.5501, 33.5502, 33.5503, 33.5504, 33.5505, 33.5506, 33.5507, 33.5508, 33.5509, 33.551, 33.5511, 33.5512, 33.5513, 33.5514, 33.5515, 33.5516, 33.5517, 33.5518, 33.5519, 33.552, 33.5521, 33.5522, 33.5523, 33.5524, 33.5525, 33.5526, 33.5527, 33.5528, 33.5529, 33.553, 33.5531, 33.5532, 33.5533, 33.5534, 33.5535, 33.5536, 33.5537, 33.5538, 33.5539, 33.554, 33.5541, 33.5542, 33.5543, 33.5544, 33.5545, 33.5546, 33.5547, 33.5548, 33.5549, 33.555, 33.5551, 33.5552, 33.5553, 33.5554, 33.5555, 33.5556, 33.5557, 33.5558, 33.5559, 33.556, 33.5561, 33.5562, 33.5563, 33.5564, 33.5565, 33.5566, 33.5567, 33.5568, 33.5569, 33.557, 33.5571, 33.5572, 33.5573, 33.5574, 33.5575, 33.5576, 33.5577, 33.5578, 33.5579, 33.558, 33.5581, 33.5582, 33.5583, 33.5584, 33.5585, 33.5586, 33.5587, 33.5588, 33.5589, 33.559, 33.5591, 33.5592, 33.5593, 33.5594, 33.5595, 33.5596, 33.5597, 33.5598, 33.5599, 33.56, 33.5601, 33.5602, 33.5603, 33.5604, 33.5605, 33.5606, 33.5607, 33.5608, 33.5609, 33.561, 33.5611, 33.5612, 33.5613, 33.5614, 33.5615, 33.5616, 33.5617, 33.5618, 33.5619, 33.562, 33.5621, 33.5622, 33.5623, 33.5624, 33.5625, 33.5626, 33.5627, 33.5628, 33.5629, 33.563, 33.5631, 33.5632, 33.5633, 33.5634, 33.5635, 33.5636, 33.5637, 33.5638, 33.5639, 33.564, 33.5641, 33.5642, 33.5643, 33.5644, 33.5645, 33.5646, 33.5647, 33.5648, 33.5649, 33.565, 33.5651, 33.5652, 33.5653, 33.5654, 33.5655, 33.5656, 33.5657, 33.5658, 33.5659, 33.566, 33.5661, 33.5662, 33.5663, 33.5664, 33.5665, 33.5666, 33.5667, 33.5668, 33.5669, 33.567, 33.5671, 33.5672, 33.5673, 33.5674, 33.5675, 33.5676, 33.5677, 33.5678, 33.5679, 33.568, 33.5681, 33.5682, 33.5683, 33.5684, 33.5685, 33.5686, 33.5687, 33.5688, 33.5689, 33.569, 33.5691, 33.5692, 33.5693, 33.5694, 33.5695, 33.5696, 33.5697, 33.5698, 33.5699, 33.57, 33.5701, 33.5702, 33.5703, 33.5704, 33.5705, 33.5706, 33.5707, 33.5708, 33.5709, 33.571, 33.5711, 33.5712, 33.5713, 33.5714, 33.5715, 33.5716, 33.5717, 33.5718, 33.5719, 33.572, 33.5721, 33.5722, 33.5723, 33.5724, 33.5725, 33.5726, 33.5727, 33.5728, 33.5729, 33.573, 33.5731, 33.5732, 33.5733, 33.5734, 33.5735, 33.5736, 33.5737, 33.5738, 33.5739, 33.574, 33.5741, 33.5742, 33.5743, 33.5744, 33.5745, 33.5746, 33.5747, 33.5748, 33.5749, 33.575, 33.5751, 33.5752, 33.5753, 33.5754, 33.5755, 33.5756, 33.5757, 33.5758, 33.5759, 33.576, 33.5761, 33.5762, 33.5763, 33.5764, 33.5765, 33.5766, 33.5767, 33.5768, 33.5769, 33.577, 33.5771, 33.5772, 33.5773, 33.5774, 33.5775, 33.5776, 33.5777, 33.5778, 33.5779, 33.578, 33.5781, 33.5782, 33.5783, 33.5784, 33.5785, 33.5786, 33.5787, 33.5788, 33.5789, 33.579, 33.5791, 33.5792, 33.5793, 33.5794, 33.5795, 33.5796, 33.5797, 33.5798, 33.5799, 33.58, 33.5801, 33.5802, 33.5803, 33.5804, 33.5805, 33.5806, 33.5807, 33.5808, 33.5809, 33.581, 33.5811, 33.5812, 33.5813, 33.5814, 33.5815, 33.5816, 33.5817, 33.5818, 33.5819, 33.582, 33.5821, 33.5822, 33.5823, 33.5824, 33.5825, 33.5826, 33.5827, 33.5828, 33.5829, 33.583, 33.5831, 33.5832, 33.5833, 33.5834, 33.5835, 33.5836, 33.5837, 33.5838, 33.5839, 33.584, 33.5841, 33.5842, 33.5843, 33.5844, 33.5845, 33.5846, 33.5847, 33.5848, 33.5849, 33.585, 33.5851, 33.5852, 33.5853, 33.5854, 33.5855, 33.5856, 33.5857, 33.5858, 33.5859".split(",");
        System.out.println(s.length);
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }

}