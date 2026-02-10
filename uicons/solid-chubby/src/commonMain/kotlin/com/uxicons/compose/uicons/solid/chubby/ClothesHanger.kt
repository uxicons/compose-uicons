package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClothesHanger: ImageVector? = null

val Icons.Sc.ClothesHanger: ImageVector
    get() = _ClothesHanger ?: UXIcon(name = "ClothesHanger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.0f, 11.11f)
                curveToRelative(-0.1f, -0.06f, -0.2f, -0.12f, -0.31f, -0.18f)
                curveToRelative(1.54f, -1.41f, 2.31f, -3.03f, 2.31f, -4.92f)
                curveToRelative(0f, -3.32f, -1.68f, -5f, -5f, -5f)
                curveToRelative(-3.14f, 0f, -4.82f, 1.5f, -4.99f, 4.45f)
                curveToRelative(-0.05f, 0.83f, 0.58f, 1.53f, 1.41f, 1.58f)
                curveToRelative(0.83f, 0.01f, 1.54f, -0.58f, 1.58f, -1.41f)
                curveToRelative(0.07f, -1.17f, 0.26f, -1.62f, 1.99f, -1.62f)
                curveToRelative(1.66f, 0f, 2f, 0.34f, 2f, 2f)
                curveToRelative(0f, 2.49f, -2.91f, 4.1f, -5.0f, 5.11f)
                curveToRelative(-4.12f, 2.44f, -8.0f, 4.75f, -8.0f, 7.54f)
                curveToRelative(0f, 2.28f, 1.08f, 3.58f, 3.18f, 3.84f)
                curveToRelative(2.32f, 0.34f, 4.95f, 0.51f, 7.82f, 0.51f)
                reflectiveCurveToRelative(5.5f, -0.17f, 7.79f, -0.51f)
                curveToRelative(2.13f, -0.27f, 3.21f, -1.56f, 3.21f, -3.84f)
                curveToRelative(0f, -2.79f, -3.89f, -5.1f, -8.0f, -7.54f)
                close()
                moveTo(19.38f, 19.52f)
                curveToRelative(-1.49f, 0.22f, -3.99f, 0.48f, -7.38f, 0.48f)
                reflectiveCurveToRelative(-5.89f, -0.26f, -7.41f, -0.48f)
                curveToRelative(-0.37f, -0.05f, -0.59f, -0.28f, -0.59f, -0.87f)
                curveToRelative(0.02f, -1.1f, 4.42f, -3.71f, 6.53f, -4.96f)
                curveToRelative(0.5f, -0.3f, 0.99f, -0.59f, 1.47f, -0.88f)
                curveToRelative(0.47f, 0.29f, 0.97f, 0.58f, 1.47f, 0.88f)
                curveToRelative(2.11f, 1.25f, 6.51f, 3.87f, 6.53f, 4.96f)
                curveToRelative(0f, 0.58f, -0.21f, 0.82f, -0.62f, 0.87f)
                close()
            }
        }.also { _ClothesHanger = it}
