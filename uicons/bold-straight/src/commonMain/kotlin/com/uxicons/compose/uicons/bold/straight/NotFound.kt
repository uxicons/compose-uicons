package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotFound: ImageVector? = null

val Icons.Bs.NotFound: ImageVector
    get() = _NotFound ?: UXIcon(name = "NotFound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 1f)
                lineTo(3.5f, 1f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21f, 20f)
                lineTo(3f, 20f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                close()
                moveTo(12.42f, 13.29f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(7.77f, 12.31f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(0.98f, -0.98f)
                close()
                moveTo(8.15f, 17.14f)
                curveToRelative(2.58f, -1.51f, 5.12f, -1.51f, 7.71f, 0f)
                lineToRelative(-1.01f, 1.73f)
                curveToRelative(-1.96f, -1.15f, -3.73f, -1.15f, -5.69f, 0f)
                lineToRelative(-1.01f, -1.73f)
                close()
            }
        }.also { _NotFound = it}
