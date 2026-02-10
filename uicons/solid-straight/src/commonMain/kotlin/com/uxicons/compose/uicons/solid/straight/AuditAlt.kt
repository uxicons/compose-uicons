package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AuditAlt: ImageVector? = null

val Icons.Ss.AuditAlt: ImageVector
    get() = _AuditAlt ?: UXIcon(name = "AuditAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 0f)
                lineTo(1f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(14f)
                lineTo(15f, 0f)
                close()
                moveTo(12f, 11f)
                lineTo(4f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                lineTo(3f, 7f)
                close()
                moveTo(23f, 15.76f)
                verticalLineToRelative(5.24f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-3f)
                lineTo(17f, 0f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8.76f)
                lineToRelative(2f, 4f)
                close()
            }
        }.also { _AuditAlt = it}
