package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Refer: ImageVector? = null

val Icons.Ss.Refer: ImageVector
    get() = _Refer ?: UXIcon(name = "Refer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5.5f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(7.43f, 0f, 5.5f, 0f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(17.5f, 17f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                close()
                moveTo(8.42f, 18.59f)
                curveToRelative(0.77f, 0.78f, 0.77f, 2.04f, 0f, 2.81f)
                lineToRelative(-2.51f, 2.51f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.01f)
                lineToRelative(-1.51f, -1.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.51f, 2.51f)
                close()
            }
        }.also { _Refer = it}
