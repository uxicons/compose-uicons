package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownSmallBig: ImageVector? = null

val Icons.Rs.ArrowDownSmallBig: ImageVector
    get() = _ArrowDownSmallBig ?: UXIcon(name = "ArrowDownSmallBig") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 17.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.5f, 4.5f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.19f, -1.41f, -0.58f)
                lineTo(0.09f, 18.91f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.5f, 3.5f)
                lineTo(4.96f, 0f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(0.04f, 21f, 0.04f, 21f)
                lineToRelative(3.5f, -3.5f)
                close()
                moveTo(14f, 13f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
                lineTo(14f, 23f)
                lineTo(14f, 13f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
                moveTo(24f, 1f)
                lineTo(24f, 9f)
                horizontalLineToRelative(-8f)
                lineTo(16f, 1f)
                horizontalLineToRelative(8f)
                close()
                moveTo(22f, 3f)
                horizontalLineToRelative(-4f)
                lineTo(18f, 7f)
                horizontalLineToRelative(4f)
                lineTo(22f, 3f)
                close()
            }
        }.also { _ArrowDownSmallBig = it}
