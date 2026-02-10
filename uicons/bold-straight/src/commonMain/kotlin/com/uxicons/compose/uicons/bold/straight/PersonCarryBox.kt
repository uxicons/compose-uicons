package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCarryBox: ImageVector? = null

val Icons.Bs.PersonCarryBox: ImageVector
    get() = _PersonCarryBox ?: UXIcon(name = "PersonCarryBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(3f, 18.12f)
                verticalLineToRelative(5.88f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.97f)
                lineToRelative(-2.38f, -1.46f)
                curveToRelative(-0.22f, -0.14f, -0.43f, -0.29f, -0.62f, -0.45f)
                close()
                moveTo(21f, 5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-11.33f)
                lineToRelative(-1.67f, -2.67f)
                verticalLineToRelative(5.06f)
                lineToRelative(2.89f, 1.77f)
                verticalLineToRelative(6.84f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.16f)
                lineToRelative(-3.46f, -2.12f)
                curveToRelative(-0.88f, -0.54f, -1.43f, -1.52f, -1.43f, -2.56f)
                verticalLineToRelative(-5.66f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.39f)
                curveToRelative(1.21f, 0f, 2.32f, 0.61f, 2.97f, 1.64f)
                lineToRelative(1.47f, 2.36f)
                horizontalLineToRelative(1.67f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(18f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _PersonCarryBox = it}
