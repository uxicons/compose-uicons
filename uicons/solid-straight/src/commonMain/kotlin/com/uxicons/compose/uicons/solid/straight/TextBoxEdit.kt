package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextBoxEdit: ImageVector? = null

val Icons.Ss.TextBoxEdit: ImageVector
    get() = _TextBoxEdit ?: UXIcon(name = "TextBoxEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 2f)
                horizontalLineToRelative(-1.5f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.77f, 0f, 1.47f, 0.3f, 2f, 0.78f)
                curveToRelative(0.53f, -0.48f, 1.23f, -0.78f, 2f, -0.78f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(21f, 3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(7f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(17f, 21f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.77f, 0f, 1.47f, -0.3f, 2f, -0.78f)
                curveToRelative(0.53f, 0.48f, 1.23f, 0.78f, 2f, 0.78f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(15f, 21f)
                lineTo(0f, 21f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(18f)
                close()
                moveTo(11f, 7f)
                lineTo(3f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _TextBoxEdit = it}
