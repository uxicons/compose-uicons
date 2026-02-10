package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ObjectsColumn: ImageVector? = null

val Icons.Ts.ObjectsColumn: ImageVector
    get() = _ObjectsColumn ?: UXIcon(name = "ObjectsColumn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(11f)
                lineTo(11f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                close()
                moveTo(10f, 8f)
                lineTo(1f, 8f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(7f)
                close()
                moveTo(13f, 24f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(9f)
                close()
                moveTo(14f, 16f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(11f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 12f)
                horizontalLineToRelative(-9f)
                lineTo(14f, 1f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(0f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-13f)
                lineTo(0f, 11f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(1f, 12f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(11f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-9.5f)
                close()
            }
        }.also { _ObjectsColumn = it}
