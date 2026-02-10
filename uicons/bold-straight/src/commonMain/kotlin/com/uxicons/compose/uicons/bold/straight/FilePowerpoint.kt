package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilePowerpoint: ImageVector? = null

val Icons.Bs.FilePowerpoint: ImageVector
    get() = _FilePowerpoint ?: UXIcon(name = "FilePowerpoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.66f)
                lineTo(22f, 24f)
                close()
                moveTo(5f, 12f)
                horizontalLineToRelative(14f)
                lineTo(19f, 8f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 12f)
                close()
                moveTo(15f, 17f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                close()
            }
        }.also { _FilePowerpoint = it}
