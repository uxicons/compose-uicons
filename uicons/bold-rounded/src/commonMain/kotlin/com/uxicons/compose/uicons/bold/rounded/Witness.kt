package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Witness: ImageVector? = null

val Icons.Br.Witness: ImageVector
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
            moveTo(15.5f, 17f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
            reflectiveCurveToRelative(-6.5f, 2.92f, -6.5f, 6.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.65f, 0.42f, 1.2f, 1f, 1.41f)
            verticalLineToRelative(2.59f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(9f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.59f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(8.5f, 13f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            close()
            moveTo(21.0f, 0f)
            horizontalLineToRelative(-3.0f)
            curveToRelative(-1.66f, 0.0f, -3f, 1.34f, -3.0f, 3.0f)
            lineToRelative(0.0f, 5.77f)
            curveToRelative(0f, 0.64f, 0.52f, 1.09f, 1.09f, 1.09f)
            curveToRelative(0.2f, 0f, 0.4f, -0.05f, 0.58f, -0.17f)
            lineToRelative(2.45f, -1.69f)
            horizontalLineToRelative(1.87f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            verticalLineToRelative(-2.0f)
            curveToRelative(-0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
            close()
            moveTo(21f, 5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(3f)
            close()
        }
    }.also { _Witness = it }
