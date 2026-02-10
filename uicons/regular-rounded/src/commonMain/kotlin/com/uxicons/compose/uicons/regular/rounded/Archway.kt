package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archway: ImageVector? = null

val Icons.Rr.Archway: ImageVector
    get() = _Archway ?: UXIcon(name = "Archway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 21f)
                horizontalLineToRelative(-1f)
                lineTo(22f, 6.41f)
                lineToRelative(1.3f, -1.3f)
                curveToRelative(0.69f, -0.69f, 0.9f, -1.72f, 0.52f, -2.63f)
                curveToRelative(-0.38f, -0.9f, -1.25f, -1.49f, -2.23f, -1.49f)
                lineTo(2.41f, 1.0f)
                curveTo(1.43f, 1f, 0.55f, 1.58f, 0.18f, 2.49f)
                curveTo(-0.2f, 3.39f, 0.01f, 4.42f, 0.7f, 5.12f)
                lineToRelative(1.3f, 1.3f)
                verticalLineToRelative(14.59f)
                lineTo(1f, 21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(5f, 23f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(2.03f, 3.25f)
                curveToRelative(0.04f, -0.1f, 0.14f, -0.25f, 0.38f, -0.25f)
                lineTo(21.59f, 3f)
                curveToRelative(0.24f, 0f, 0.34f, 0.16f, 0.38f, 0.25f)
                reflectiveCurveToRelative(0.08f, 0.28f, -0.09f, 0.45f)
                lineToRelative(-1.3f, 1.3f)
                lineTo(3.41f, 5f)
                lineToRelative(-1.3f, -1.3f)
                curveToRelative(-0.17f, -0.17f, -0.13f, -0.35f, -0.09f, -0.45f)
                close()
                moveTo(18f, 20f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                lineTo(4f, 7f)
                lineTo(20f, 7f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _Archway = it}
