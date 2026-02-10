package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Witness: ImageVector? = null

val Icons.Bs.Witness: ImageVector
    get() = _Witness ?: UXIcon(name = "Witness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                close()
                moveTo(8.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(22f, 0f)
                lineTo(17f, 0.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2.0f, 2.0f)
                lineToRelative(0.0f, 6.77f)
                curveToRelative(0f, 0.64f, 0.52f, 1.09f, 1.09f, 1.09f)
                curveToRelative(0.2f, 0f, 0.4f, -0.05f, 0.58f, -0.17f)
                lineToRelative(2.45f, -1.69f)
                horizontalLineToRelative(4.87f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(21f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(15f, 15.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(12f, 17f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _Witness = it}
