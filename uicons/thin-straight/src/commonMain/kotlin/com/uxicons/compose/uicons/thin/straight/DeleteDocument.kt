package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteDocument: ImageVector? = null

val Icons.Ts.DeleteDocument: ImageVector
    get() = _DeleteDocument ?: UXIcon(name = "DeleteDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                lineTo(3f, 23f)
                close()
                moveTo(15.85f, 11.85f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _DeleteDocument = it}
