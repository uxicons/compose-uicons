package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AuditAlt: ImageVector? = null

val Icons.Sr.AuditAlt: ImageVector
    get() = _AuditAlt ?: UXIcon(name = "AuditAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 0f)
                lineTo(6f, 0f)
                curveTo(3.24f, 0f, 1f, 2.24f, 1f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(9f)
                lineTo(15f, 0f)
                close()
                moveTo(11f, 11f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(12f, 7f)
                lineTo(4f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(23f, 16.24f)
                verticalLineToRelative(2.76f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-1f)
                lineTo(17f, 0f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(7.76f)
                lineToRelative(1.79f, 3.58f)
                curveToRelative(0.14f, 0.28f, 0.21f, 0.58f, 0.21f, 0.89f)
                close()
            }
        }.also { _AuditAlt = it}
