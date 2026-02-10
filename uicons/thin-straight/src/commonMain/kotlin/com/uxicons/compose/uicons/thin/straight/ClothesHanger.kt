package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClothesHanger: ImageVector? = null

val Icons.Ts.ClothesHanger: ImageVector
    get() = _ClothesHanger ?: UXIcon(name = "ClothesHanger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.92f, 18.13f)
                lineToRelative(-10.04f, -7.13f)
                curveToRelative(1.3f, -0.91f, 4.08f, -3.11f, 4.12f, -5.26f)
                curveToRelative(0.02f, -1.23f, -0.44f, -2.39f, -1.29f, -3.25f)
                curveToRelative(-0.93f, -0.94f, -2.28f, -1.49f, -3.71f, -1.49f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                curveToRelative(1.16f, 0f, 2.26f, 0.43f, 3.0f, 1.19f)
                curveToRelative(0.67f, 0.68f, 1.01f, 1.56f, 1.0f, 2.53f)
                curveToRelative(-0.03f, 1.67f, -2.67f, 3.78f, -3.99f, 4.66f)
                lineToRelative(-0.01f, -0.01f)
                lineTo(1.06f, 18.14f)
                curveToRelative(-0.67f, 0.51f, -1.06f, 1.31f, -1.06f, 2.15f)
                curveToRelative(0f, 1.49f, 1.21f, 2.7f, 2.7f, 2.7f)
                horizontalLineToRelative(18.61f)
                curveToRelative(1.49f, 0f, 2.7f, -1.21f, 2.7f, -2.7f)
                curveToRelative(0f, -0.84f, -0.4f, -1.64f, -1.08f, -2.16f)
                close()
                moveTo(21.3f, 21.99f)
                lineTo(2.7f, 21.99f)
                curveToRelative(-0.94f, 0f, -1.7f, -0.76f, -1.7f, -1.7f)
                curveToRelative(0f, -0.53f, 0.25f, -1.03f, 0.66f, -1.34f)
                lineToRelative(10.35f, -7.35f)
                lineToRelative(10.33f, 7.34f)
                curveToRelative(0.42f, 0.32f, 0.67f, 0.82f, 0.67f, 1.35f)
                curveToRelative(0f, 0.94f, -0.76f, 1.7f, -1.7f, 1.7f)
                close()
            }
        }.also { _ClothesHanger = it}
