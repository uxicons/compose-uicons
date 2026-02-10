package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AuditAlt: ImageVector? = null

val Icons.Tr.AuditAlt: ImageVector
    get() = _AuditAlt ?: UXIcon(name = "AuditAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 5.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(4.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(11.5f, 9f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(23f, 16.71f)
                verticalLineToRelative(2.79f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(5.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(1f, 4.5f)
                curveTo(1f, 2.02f, 3.02f, 0f, 5.5f, 0f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(6.79f)
                curveToRelative(0f, 0.39f, 0.09f, 0.77f, 0.26f, 1.12f)
                lineToRelative(1.37f, 2.73f)
                curveToRelative(0.24f, 0.48f, 0.37f, 1.02f, 0.37f, 1.56f)
                close()
                moveTo(5.5f, 23f)
                horizontalLineToRelative(10.5f)
                lineTo(16f, 1f)
                lineTo(5.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(22f, 16.71f)
                curveToRelative(0f, -0.39f, -0.09f, -0.77f, -0.26f, -1.12f)
                lineToRelative(-1.37f, -2.73f)
                curveToRelative(-0.24f, -0.48f, -0.37f, -1.02f, -0.37f, -1.56f)
                verticalLineToRelative(-6.79f)
                curveToRelative(0f, -1.76f, -1.31f, -3.22f, -3f, -3.46f)
                verticalLineToRelative(21.96f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.79f)
                close()
            }
        }.also { _AuditAlt = it}
