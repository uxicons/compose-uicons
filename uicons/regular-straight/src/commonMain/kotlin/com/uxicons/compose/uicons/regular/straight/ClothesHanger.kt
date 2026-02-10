package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClothesHanger: ImageVector? = null

val Icons.Rs.ClothesHanger: ImageVector
    get() = _ClothesHanger ?: UXIcon(name = "ClothesHanger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.75f, 17.41f)
                lineToRelative(-9.11f, -6.47f)
                curveToRelative(2.64f, -2.17f, 3.84f, -3.16f, 3.17f, -6.09f)
                curveToRelative(-0.42f, -1.82f, -1.86f, -3.27f, -3.68f, -3.68f)
                curveToRelative(-1.51f, -0.34f, -3.07f, 0f, -4.26f, 0.95f)
                curveToRelative(-1.19f, 0.95f, -1.88f, 2.37f, -1.88f, 3.89f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.91f, 0.41f, -1.76f, 1.12f, -2.33f)
                curveToRelative(0.72f, -0.58f, 1.64f, -0.78f, 2.57f, -0.56f)
                curveToRelative(1.06f, 0.24f, 1.94f, 1.12f, 2.18f, 2.18f)
                curveToRelative(0.38f, 1.68f, 0.15f, 1.93f, -2.5f, 4.11f)
                lineTo(1.22f, 17.43f)
                curveToRelative(-0.77f, 0.58f, -1.22f, 1.51f, -1.22f, 2.47f)
                curveToRelative(0f, 1.71f, 1.39f, 3.1f, 3.1f, 3.1f)
                horizontalLineToRelative(17.8f)
                curveToRelative(1.71f, 0f, 3.1f, -1.39f, 3.1f, -3.1f)
                curveToRelative(0f, -0.96f, -0.46f, -1.88f, -1.25f, -2.49f)
                close()
                moveTo(20.9f, 21f)
                lineTo(3.1f, 21f)
                curveToRelative(-0.61f, 0f, -1.1f, -0.49f, -1.1f, -1.1f)
                curveToRelative(0f, -0.34f, 0.16f, -0.67f, 0.41f, -0.86f)
                lineToRelative(9.59f, -6.82f)
                lineToRelative(9.56f, 6.79f)
                curveToRelative(0.27f, 0.21f, 0.43f, 0.54f, 0.43f, 0.88f)
                curveToRelative(0f, 0.61f, -0.49f, 1.1f, -1.1f, 1.1f)
                close()
            }
        }.also { _ClothesHanger = it}
