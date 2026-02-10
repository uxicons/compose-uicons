package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bonus: ImageVector? = null

val Icons.Bs.Bonus: ImageVector
    get() = _Bonus ?: UXIcon(name = "Bonus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.61f, 9.47f)
                curveToRelative(0.25f, -0.43f, 0.39f, -0.94f, 0.39f, -1.47f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.06f, -0.55f, -2.0f, -1.39f, -2.53f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(20.4f, 15.4f)
                curveToRelative(1.01f, -1.56f, 1.6f, -3.41f, 1.6f, -5.4f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.49f, 2f, 10f)
                curveToRelative(0f, 1.99f, 0.59f, 3.84f, 1.6f, 5.4f)
                lineToRelative(-3.6f, 3.6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                lineToRelative(4.36f, -4.36f)
                curveToRelative(0.84f, 0.23f, 1.72f, 0.36f, 2.64f, 0.36f)
                reflectiveCurveToRelative(1.79f, -0.13f, 2.64f, -0.36f)
                lineToRelative(4.36f, 4.36f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                lineToRelative(-3.6f, -3.6f)
                close()
                moveTo(5f, 10f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                close()
            }
        }.also { _Bonus = it}
