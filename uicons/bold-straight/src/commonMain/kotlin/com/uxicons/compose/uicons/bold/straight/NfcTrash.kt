package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcTrash: ImageVector? = null

val Icons.Bs.NfcTrash: ImageVector
    get() = _NfcTrash ?: UXIcon(name = "NfcTrash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 19f)
                lineTo(11f, 19f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.88f)
                curveToRelative(-0.73f, -0.84f, -1.8f, -1.38f, -3f, -1.38f)
                lineTo(19f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(11.62f, 5f)
                lineTo(5f, 5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.38f)
                lineToRelative(3.62f, -3.62f)
                close()
                moveTo(24f, 15f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(14f, 9.38f)
                curveToRelative(0.73f, -0.84f, 1.8f, -1.38f, 3f, -1.38f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(1.38f)
                close()
            }
        }.also { _NfcTrash = it}
