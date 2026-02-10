package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AuditAlt: ImageVector? = null

val Icons.Ts.AuditAlt: ImageVector
    get() = _AuditAlt ?: UXIcon(name = "AuditAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 5f)
                verticalLineToRelative(1f)
                lineTo(4f, 6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                close()
                moveTo(6f, 10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                close()
                moveTo(23f, 15.88f)
                verticalLineToRelative(5.62f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(1f, 24f)
                lineTo(1f, 0f)
                horizontalLineToRelative(17.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(9.38f)
                lineToRelative(2f, 4f)
                close()
                moveTo(16f, 23f)
                lineTo(16f, 1f)
                lineTo(2f, 1f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(14f)
                close()
                moveTo(22f, 16.12f)
                lineToRelative(-2f, -4f)
                lineTo(20f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.38f)
                close()
            }
        }.also { _AuditAlt = it}
