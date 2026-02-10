package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookSection: ImageVector? = null

val Icons.Bs.BookSection: ImageVector
    get() = _BookSection ?: UXIcon(name = "BookSection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(5f, 0f)
                curveTo(2.79f, 0f, 1f, 1.79f, 1f, 4f)
                lineTo(1f, 20f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                lineTo(23f, 24f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20f, 16f)
                lineTo(10f, 16f)
                lineTo(10f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(13f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.04f, -1f, 0.13f)
                lineTo(4f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5f, 21f)
                close()
                moveTo(12f, 9.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.31f, -0.06f, -0.61f, -0.16f, -0.89f)
                curveToRelative(0.7f, -0.44f, 1.16f, -1.22f, 1.16f, -2.11f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.31f, 0.06f, 0.61f, 0.16f, 0.89f)
                curveToRelative(-0.7f, 0.44f, -1.16f, 1.22f, -1.16f, 2.11f)
                close()
                moveTo(16f, 9.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _BookSection = it}
