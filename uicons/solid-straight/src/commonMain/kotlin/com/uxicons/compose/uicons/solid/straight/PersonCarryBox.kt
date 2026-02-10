package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCarryBox: ImageVector? = null

val Icons.Ss.PersonCarryBox: ImageVector
    get() = _PersonCarryBox ?: UXIcon(name = "PersonCarryBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1.77f)
                lineToRelative(-1.67f, -3.34f)
                curveToRelative(-0.51f, -1.02f, -1.54f, -1.66f, -2.68f, -1.66f)
                horizontalLineToRelative(-1.38f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.66f)
                curveToRelative(0f, 0.88f, 0.45f, 1.67f, 1.2f, 2.14f)
                lineToRelative(3.8f, 2.27f)
                verticalLineToRelative(5.43f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.57f)
                lineToRelative(-2f, -1.2f)
                verticalLineToRelative(-7.23f)
                lineToRelative(2.0f, 3.99f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(4f, 18.51f)
                lineToRelative(2f, 1.2f)
                verticalLineToRelative(4.3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.49f)
                close()
            }
        }.also { _PersonCarryBox = it}
