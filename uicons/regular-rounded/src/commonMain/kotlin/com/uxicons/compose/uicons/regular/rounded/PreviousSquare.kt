package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PreviousSquare: ImageVector? = null

val Icons.Rr.PreviousSquare: ImageVector
    get() = _PreviousSquare ?: UXIcon(name = "PreviousSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(16f, 7.22f)
                curveToRelative(-0.62f, -0.33f, -1.37f, -0.29f, -1.95f, 0.11f)
                lineToRelative(-4.57f, 3.13f)
                curveToRelative(-0.2f, 0.13f, -0.35f, 0.31f, -0.48f, 0.5f)
                verticalLineToRelative(-2.96f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.96f)
                curveToRelative(0.13f, 0.19f, 0.28f, 0.36f, 0.48f, 0.5f)
                lineToRelative(4.57f, 3.13f)
                curveToRelative(0.32f, 0.22f, 0.69f, 0.33f, 1.07f, 0.33f)
                curveToRelative(0.3f, 0f, 0.61f, -0.07f, 0.89f, -0.22f)
                curveToRelative(0.62f, -0.33f, 1f, -0.96f, 1f, -1.65f)
                verticalLineToRelative(-6.26f)
                curveToRelative(0f, -0.69f, -0.38f, -1.33f, -1f, -1.65f)
                close()
                moveTo(15f, 14.9f)
                lineToRelative(-4.23f, -2.9f)
                lineToRelative(4.23f, -2.9f)
                verticalLineToRelative(5.79f)
                close()
            }
        }.also { _PreviousSquare = it}
