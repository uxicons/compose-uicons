package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextBoxEdit: ImageVector? = null

val Icons.Ts.TextBoxEdit: ImageVector
    get() = _TextBoxEdit ?: UXIcon(name = "TextBoxEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 23f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.82f, 0f, -1.54f, -0.39f, -2f, -1.0f)
                curveToRelative(-0.46f, 0.61f, -1.18f, 1.0f, -2f, 1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(16f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(13f, 0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.82f, 0f, 1.54f, 0.39f, 2f, 1.0f)
                curveToRelative(0.46f, -0.61f, 1.18f, -1.0f, 2f, -1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(14f, 20f)
                lineTo(1f, 20f)
                lineTo(1f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                close()
                moveTo(21.5f, 3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.5f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(8f, 17f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(3f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _TextBoxEdit = it}
