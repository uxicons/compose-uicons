package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextBoxEdit: ImageVector? = null

val Icons.Bs.TextBoxEdit: ImageVector
    get() = _TextBoxEdit ?: UXIcon(name = "TextBoxEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 10f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(3f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-3f)
                lineTo(3.5f, 2f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                lineTo(3f, 19f)
                lineTo(3f, 5.5f)
                close()
                moveTo(21f, 2.05f)
                verticalLineToRelative(19.95f)
                horizontalLineToRelative(3f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.2f, -3f, -3.45f)
                close()
                moveTo(15.5f, 0.63f)
                curveToRelative(-0.57f, -0.4f, -1.26f, -0.63f, -2f, -0.63f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.74f, 0f, 1.43f, -0.23f, 2f, -0.63f)
                curveToRelative(0.57f, 0.4f, 1.26f, 0.63f, 2f, 0.63f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(17f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.74f, 0f, -1.43f, 0.23f, -2f, 0.63f)
                close()
            }
        }.also { _TextBoxEdit = it}
