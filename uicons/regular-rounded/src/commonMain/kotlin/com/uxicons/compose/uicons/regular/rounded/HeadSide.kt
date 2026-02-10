package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSide: ImageVector? = null

val Icons.Rr.HeadSide: ImageVector
    get() = _HeadSide ?: UXIcon(name = "HeadSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 21f)
                horizontalLineToRelative(0.49f)
                curveToRelative(2.5f, 0f, 4.63f, -1.87f, 4.96f, -4.34f)
                lineToRelative(0.22f, -1.66f)
                horizontalLineToRelative(0.33f)
                curveToRelative(1.3f, 0f, 2f, -1.03f, 2f, -2f)
                curveToRelative(0f, -1.42f, -2.93f, -7.01f, -4.2f, -8.58f)
                curveTo(17.36f, 1.16f, 13.49f, -0.45f, 9.45f, 0.11f)
                curveTo(4.46f, 0.79f, 0.5f, 4.95f, 0.05f, 9.98f)
                curveToRelative(-0.25f, 2.77f, 0.54f, 5.5f, 2.21f, 7.69f)
                curveToRelative(0.48f, 0.62f, 0.74f, 1.46f, 0.74f, 2.35f)
                verticalLineToRelative(0.97f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
                moveTo(18.22f, 5.65f)
                curveToRelative(1.31f, 1.62f, 3.65f, 6.45f, 3.78f, 7.35f)
                horizontalLineToRelative(-1.2f)
                curveToRelative(-0.5f, 0f, -0.93f, 0.37f, -0.99f, 0.87f)
                lineToRelative(-0.33f, 2.52f)
                curveToRelative(-0.2f, 1.49f, -1.48f, 2.61f, -2.97f, 2.61f)
                horizontalLineToRelative(-1.49f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(6f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0f, -1.33f, -0.41f, -2.6f, -1.15f, -3.57f)
                curveToRelative(-1.37f, -1.79f, -2.02f, -4.03f, -1.81f, -6.3f)
                curveToRelative(0.37f, -4.12f, 3.6f, -7.51f, 7.69f, -8.07f)
                curveToRelative(0.43f, -0.06f, 0.86f, -0.09f, 1.28f, -0.09f)
                curveToRelative(2.83f, 0f, 5.46f, 1.3f, 7.22f, 3.65f)
                close()
            }
        }.also { _HeadSide = it}
