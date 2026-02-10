package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LastSquare: ImageVector? = null

val Icons.Sr.LastSquare: ImageVector
    get() = _LastSquare ?: UXIcon(name = "LastSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 9.1f)
                lineToRelative(4.23f, 2.9f)
                lineToRelative(-4.23f, 2.9f)
                verticalLineToRelative(-5.79f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(17f, 8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.96f)
                curveToRelative(-0.13f, -0.19f, -0.28f, -0.36f, -0.48f, -0.5f)
                lineToRelative(-4.57f, -3.13f)
                curveToRelative(-0.58f, -0.4f, -1.33f, -0.44f, -1.95f, -0.11f)
                curveToRelative(-0.62f, 0.33f, -1f, 0.96f, -1f, 1.65f)
                verticalLineToRelative(6.26f)
                curveToRelative(0f, 0.69f, 0.38f, 1.33f, 1f, 1.65f)
                curveToRelative(0.28f, 0.15f, 0.58f, 0.22f, 0.89f, 0.22f)
                curveToRelative(0.38f, 0f, 0.75f, -0.11f, 1.07f, -0.33f)
                lineToRelative(4.57f, -3.13f)
                curveToRelative(0.2f, -0.13f, 0.35f, -0.31f, 0.48f, -0.5f)
                verticalLineToRelative(2.96f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(17f, 8f)
                close()
            }
        }.also { _LastSquare = it}
