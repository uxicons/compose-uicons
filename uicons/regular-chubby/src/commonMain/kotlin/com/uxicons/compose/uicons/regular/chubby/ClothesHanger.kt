package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClothesHanger: ImageVector? = null

val Icons.Rc.ClothesHanger: ImageVector
    get() = _ClothesHanger ?: UXIcon(name = "ClothesHanger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.86f, 11.56f)
                curveToRelative(-0.32f, -0.19f, -0.64f, -0.38f, -0.96f, -0.57f)
                curveToRelative(1.76f, -1.16f, 3.09f, -2.46f, 3.09f, -4.99f)
                curveToRelative(0f, -3.41f, -1.59f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 1.59f, -5f, 5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.3f, 0.7f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.7f, 3f, 3f)
                curveToRelative(0f, 1.86f, -0.96f, 2.61f, -3.52f, 4.14f)
                curveToRelative(-0.73f, 0.46f, -1.53f, 0.93f, -2.35f, 1.42f)
                curveToRelative(-4.18f, 2.48f, -8.14f, 4.83f, -8.14f, 7.44f)
                curveToRelative(0f, 2.09f, 0.94f, 3.23f, 2.85f, 3.47f)
                curveToRelative(2.41f, 0.35f, 5.15f, 0.53f, 8.14f, 0.53f)
                reflectiveCurveToRelative(5.73f, -0.18f, 8.12f, -0.53f)
                curveToRelative(1.94f, -0.24f, 2.88f, -1.38f, 2.88f, -3.47f)
                curveToRelative(0f, -2.61f, -3.95f, -4.96f, -8.14f, -7.44f)
                close()
                moveTo(19.86f, 20.49f)
                curveToRelative(-1.59f, 0.23f, -4.25f, 0.51f, -7.86f, 0.51f)
                reflectiveCurveToRelative(-6.26f, -0.28f, -7.88f, -0.51f)
                curveToRelative(-0.82f, -0.1f, -1.12f, -0.26f, -1.12f, -1.49f)
                curveToRelative(0f, -1.47f, 4.31f, -4.03f, 7.16f, -5.72f)
                curveToRelative(0.63f, -0.38f, 1.25f, -0.74f, 1.84f, -1.1f)
                curveToRelative(0.59f, 0.36f, 1.21f, 0.73f, 1.84f, 1.1f)
                curveToRelative(2.85f, 1.69f, 7.16f, 4.25f, 7.16f, 5.72f)
                curveToRelative(0f, 1.23f, -0.31f, 1.38f, -1.15f, 1.49f)
                close()
            }
        }.also { _ClothesHanger = it}
