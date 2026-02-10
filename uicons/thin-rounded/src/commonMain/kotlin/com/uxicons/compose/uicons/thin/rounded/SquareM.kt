package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareM: ImageVector? = null

val Icons.Tr.SquareM: ImageVector
    get() = _SquareM ?: UXIcon(name = "SquareM") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(20f, 5.51f)
                verticalLineToRelative(13.99f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(19f, 5.51f)
                curveToRelative(0f, -0.26f, -0.11f, -0.43f, -0.3f, -0.49f)
                curveToRelative(-0.16f, -0.05f, -0.41f, -0.02f, -0.58f, 0.22f)
                lineToRelative(-5.69f, 9.52f)
                curveToRelative(-0.18f, 0.3f, -0.68f, 0.3f, -0.86f, 0f)
                lineTo(5.86f, 5.21f)
                curveToRelative(-0.15f, -0.22f, -0.4f, -0.24f, -0.56f, -0.19f)
                curveToRelative(-0.2f, 0.06f, -0.3f, 0.24f, -0.3f, 0.49f)
                verticalLineToRelative(13.99f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(4f, 5.51f)
                curveToRelative(0f, -0.7f, 0.38f, -1.25f, 1.0f, -1.45f)
                curveToRelative(0.62f, -0.2f, 1.31f, 0.04f, 1.7f, 0.6f)
                lineToRelative(5.3f, 8.86f)
                lineToRelative(5.28f, -8.83f)
                curveToRelative(0.41f, -0.59f, 1.09f, -0.83f, 1.72f, -0.63f)
                curveToRelative(0.62f, 0.2f, 1.0f, 0.75f, 1.0f, 1.45f)
                close()
            }
        }.also { _SquareM = it}
