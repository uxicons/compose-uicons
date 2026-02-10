package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PunchingBag: ImageVector? = null

val Icons.Rs.PunchingBag: ImageVector
    get() = _PunchingBag ?: UXIcon(name = "PunchingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.23f, 7.01f)
                lineToRelative(-5.22f, -5.89f)
                verticalLineToRelative(-1.12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.12f)
                lineToRelative(-5.22f, 5.89f)
                curveToRelative(-0.48f, 0.53f, -0.78f, 1.23f, -0.78f, 1.99f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.77f, -0.3f, -1.46f, -0.78f, -1.99f)
                close()
                moveTo(12f, 3f)
                lineTo(14.68f, 6f)
                horizontalLineToRelative(-5.36f)
                close()
                moveTo(17f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _PunchingBag = it}
