package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PunchingBag: ImageVector? = null

val Icons.Ss.PunchingBag: ImageVector
    get() = _PunchingBag ?: UXIcon(name = "PunchingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.23f, 7.01f)
                lineToRelative(0.02f, -0.02f)
                lineToRelative(-5.25f, -5.87f)
                verticalLineToRelative(-1.12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.12f)
                lineToRelative(-5.25f, 5.87f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(-0.48f, 0.53f, -0.78f, 1.23f, -0.78f, 1.99f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0f, -0.77f, -0.3f, -1.46f, -0.78f, -1.99f)
                close()
                moveTo(9.32f, 6f)
                lineTo(12f, 3f)
                lineTo(14.68f, 6f)
                close()
            }
        }.also { _PunchingBag = it}
