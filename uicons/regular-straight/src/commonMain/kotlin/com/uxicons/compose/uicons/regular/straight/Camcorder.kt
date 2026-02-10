package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camcorder: ImageVector? = null

val Icons.Rs.Camcorder: ImageVector
    get() = _Camcorder ?: UXIcon(name = "Camcorder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 20f)
                horizontalLineToRelative(12f)
                lineTo(16f, 10f)
                lineTo(4f, 10f)
                verticalLineToRelative(10f)
                close()
                moveTo(6f, 12f)
                lineTo(14f, 12f)
                verticalLineToRelative(6f)
                lineTo(6f, 18f)
                verticalLineToRelative(-6f)
                close()
                moveTo(24f, 8f)
                lineToRelative(-4f, 3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2.09f)
                lineTo(9.91f, 1f)
                lineTo(0f, 1f)
                lineTo(0f, 3f)
                lineTo(9.09f, 3f)
                lineToRelative(3f, 3f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                lineTo(20f, 24f)
                verticalLineToRelative(-5f)
                lineToRelative(4f, 3f)
                lineTo(24f, 8f)
                close()
                moveTo(18f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13f)
                close()
                moveTo(22f, 18f)
                lineToRelative(-2f, -1.5f)
                verticalLineToRelative(-3f)
                lineToRelative(2f, -1.5f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Camcorder = it}
