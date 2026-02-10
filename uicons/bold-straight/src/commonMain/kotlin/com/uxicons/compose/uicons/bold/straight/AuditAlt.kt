package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AuditAlt: ImageVector? = null

val Icons.Bs.AuditAlt: ImageVector
    get() = _AuditAlt ?: UXIcon(name = "AuditAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 6f)
                verticalLineToRelative(3f)
                lineTo(6f, 9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                close()
                moveTo(23f, 15.45f)
                verticalLineToRelative(5.55f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(1f, 24f)
                lineTo(1f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(8.62f)
                lineToRelative(2f, 3.83f)
                close()
                moveTo(16f, 21f)
                lineTo(16f, 3f)
                lineTo(4f, 3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(12f)
                close()
            }
        }.also { _AuditAlt = it}
