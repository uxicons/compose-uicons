package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notebook: ImageVector? = null

val Icons.Ts.Notebook: ImageVector
    get() = _Notebook ?: UXIcon(name = "Notebook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 3f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(21f, 3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(20f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(4f, 4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(17f, 10f)
                lineTo(7f, 10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 14f)
                lineTo(7f, 14f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Notebook = it}
