package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AuditAlt: ImageVector? = null

val Icons.Br.AuditAlt: ImageVector
    get() = _AuditAlt ?: UXIcon(name = "AuditAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14f, 7.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(23f, 16.43f)
            verticalLineToRelative(2.07f)
            curveToRelative(0f, 3.04f, -2.46f, 5.5f, -5.5f, 5.5f)
            lineTo(6.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(1f, 5.5f)
            curveTo(1f, 2.47f, 3.47f, 0f, 6.5f, 0f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(6.12f)
            lineToRelative(1.55f, 2.96f)
            curveToRelative(0.3f, 0.57f, 0.45f, 1.21f, 0.45f, 1.85f)
            close()
            moveTo(16f, 21f)
            lineTo(16f, 3.05f)
            curveToRelative(-0.16f, -0.03f, -0.33f, -0.05f, -0.5f, -0.05f)
            lineTo(6.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(9.5f)
            close()
        }
    }.also { _AuditAlt = it }
