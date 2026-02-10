package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownSmallBig: ImageVector? = null

val Icons.Ss.ArrowDownSmallBig: ImageVector
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
                moveTo(14f, 23f)
                horizontalLineToRelative(10f)
                lineTo(24f, 13f)
                lineTo(14f, 13f)
                verticalLineToRelative(10f)
                close()
                moveTo(16f, 1f)
                lineTo(16f, 9f)
                horizontalLineToRelative(8f)
                lineTo(24f, 1f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _ArrowDownSmallBig = it}
