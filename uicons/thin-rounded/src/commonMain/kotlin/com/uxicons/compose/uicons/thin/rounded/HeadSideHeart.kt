package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideHeart: ImageVector? = null

val Icons.Tr.HeadSideHeart: ImageVector
    get() = _HeadSideHeart ?: UXIcon(name = "HeadSideHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 21.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.99f)
                curveToRelative(2.11f, 0f, 3.96f, -1.5f, 4.4f, -3.57f)
                lineToRelative(0.52f, -2.43f)
                horizontalLineToRelative(0.55f)
                curveToRelative(1.13f, 0f, 1.55f, -0.87f, 1.55f, -1.45f)
                curveToRelative(0f, -1.28f, -2.84f, -7.43f, -4.23f, -9.15f)
                curveTo(17.34f, 1.16f, 13.34f, -0.48f, 9.32f, 0.13f)
                curveTo(4.5f, 0.85f, 0.44f, 5.29f, 0.07f, 10.23f)
                curveToRelative(-0.2f, 2.7f, 0.48f, 5.21f, 1.97f, 7.26f)
                curveToRelative(0.63f, 0.86f, 0.96f, 1.81f, 0.96f, 2.73f)
                verticalLineToRelative(1.28f)
                curveToRelative(0f, 1.47f, 1.03f, 2.5f, 2.5f, 2.5f)
                lineTo(13.5f, 24f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(18.97f, 5f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.41f, 1.75f, 4.01f, 7.68f, 4.01f, 8.54f)
                curveToRelative(0f, 0.21f, -0.11f, 0.46f, -0.55f, 0.46f)
                horizontalLineToRelative(-0.96f)
                curveToRelative(-0.24f, 0f, -0.44f, 0.17f, -0.49f, 0.4f)
                lineToRelative(-0.6f, 2.83f)
                curveToRelative(-0.34f, 1.61f, -1.78f, 2.77f, -3.42f, 2.77f)
                horizontalLineToRelative(-1.49f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 23f)
                curveToRelative(-0.69f, 0f, -1.5f, -0.39f, -1.5f, -1.5f)
                verticalLineToRelative(-1.28f)
                curveToRelative(0f, -1.14f, -0.4f, -2.29f, -1.15f, -3.32f)
                curveToRelative(-1.35f, -1.86f, -1.96f, -4.14f, -1.78f, -6.6f)
                curveTo(1.4f, 5.81f, 5.09f, 1.77f, 9.47f, 1.12f)
                curveToRelative(0.5f, -0.08f, 1.01f, -0.11f, 1.51f, -0.11f)
                curveToRelative(3.13f, 0f, 6.1f, 1.46f, 8f, 4f)
                close()
            }
        }.also { _HeadSideHeart = it}
