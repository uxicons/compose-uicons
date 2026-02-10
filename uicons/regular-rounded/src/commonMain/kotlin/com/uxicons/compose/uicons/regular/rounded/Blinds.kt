package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blinds: ImageVector? = null

val Icons.Rr.Blinds: ImageVector
    get() = _Blinds ?: UXIcon(name = "Blinds") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18.17f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                lineTo(15f, 22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(5f, 20f)
                curveToRelative(-1.3f, 0f, -2.42f, -0.84f, -2.83f, -2f)
                horizontalLineToRelative(14.83f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(18f, 2.17f)
                curveToRelative(1.16f, 0.41f, 2f, 1.52f, 2f, 2.83f)
                verticalLineToRelative(13.17f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.52f, -2f, 2.83f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.3f, -0.84f, -2.42f, -2f, -2.83f)
                close()
                moveTo(16f, 6f)
                verticalLineToRelative(2f)
                lineTo(2f, 8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                close()
                moveTo(2f, 10f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(2f, 12f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                lineTo(2.17f, 4f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
                close()
                moveTo(2f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(2f, 16f)
                close()
                moveTo(21f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Blinds = it}
