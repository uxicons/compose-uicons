package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ObjectsColumn: ImageVector? = null

val Icons.Bs.ObjectsColumn: ImageVector
    get() = _ObjectsColumn ?: UXIcon(name = "ObjectsColumn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(11f)
                lineTo(11f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                close()
                moveTo(8f, 6f)
                lineTo(3f, 6f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(13f, 24f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(9f)
                close()
                moveTo(16f, 18f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(20.5f, 0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(11f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 10f)
                horizontalLineToRelative(-5f)
                lineTo(16f, 3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(0f, 20.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-13f)
                lineTo(0f, 11f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(3f, 14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7f)
                lineTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }.also { _ObjectsColumn = it}
