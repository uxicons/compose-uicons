package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderCheck: ImageVector? = null

val Icons.Ts.FolderCheck: ImageVector
    get() = _FolderCheck ?: UXIcon(name = "FolderCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.08f, 11.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-5.65f, 5.65f)
                curveToRelative(-0.62f, 0.65f, -1.75f, 0.65f, -2.38f, 0f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.26f, 0.26f, 0.7f, 0.26f, 0.96f, 0f)
                lineToRelative(5.65f, -5.65f)
                close()
                moveTo(24f, 5.5f)
                lineTo(24f, 23f)
                lineTo(0f, 23f)
                lineTo(0f, 3.5f)
                curveTo(0f, 2.12f, 1.12f, 1f, 2.5f, 1f)
                horizontalLineToRelative(5.62f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.38f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(1f, 3.5f)
                verticalLineToRelative(3.5f)
                lineTo(23f, 7f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(11.88f, 4f)
                lineTo(7.88f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(23f, 22f)
                lineTo(23f, 8f)
                lineTo(1f, 8f)
                verticalLineToRelative(14f)
                lineTo(23f, 22f)
                close()
            }
        }.also { _FolderCheck = it}
