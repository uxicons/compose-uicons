package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraSecurity: ImageVector? = null

val Icons.Rs.CameraSecurity: ImageVector
    get() = _CameraSecurity ?: UXIcon(name = "CameraSecurity") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(5.53f)
                curveToRelative(-0.69f, 0.77f, -1.2f, 1.73f, -1.41f, 2.8f)
                lineToRelative(-0.24f, 1.2f)
                horizontalLineToRelative(12.25f)
                lineToRelative(-0.24f, -1.2f)
                curveToRelative(-0.22f, -1.07f, -0.72f, -2.03f, -1.41f, -2.8f)
                horizontalLineToRelative(5.53f)
                lineTo(22.0f, 3f)
                close()
                moveTo(15.46f, 22f)
                horizontalLineToRelative(-6.93f)
                curveToRelative(0.7f, -1.21f, 2.01f, -2f, 3.46f, -2f)
                reflectiveCurveToRelative(2.76f, 0.79f, 3.46f, 2f)
                close()
                moveTo(20f, 18f)
                lineTo(4f, 18f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _CameraSecurity = it}
