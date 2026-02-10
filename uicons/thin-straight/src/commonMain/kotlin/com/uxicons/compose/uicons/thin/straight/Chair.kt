package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chair: ImageVector? = null

val Icons.Ts.Chair: ImageVector
    get() = _Chair ?: UXIcon(name = "Chair") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 13f)
                horizontalLineToRelative(-0.5f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(7.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(5f, 13f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                lineTo(21f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                lineTo(22f, 15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(18f, 2.5f)
                lineTo(18f, 13f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(10f, 13f)
                lineTo(10f, 1f)
                horizontalLineToRelative(4f)
                lineTo(14f, 13f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(6f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                lineTo(9f, 13f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 2.5f)
                close()
                moveTo(3f, 17f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(3f, 17f)
                close()
            }
        }.also { _Chair = it}
