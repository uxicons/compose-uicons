package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmilePlus: ImageVector? = null

val Icons.Rc.SmilePlus: ImageVector
    get() = _SmilePlus ?: UXIcon(name = "SmilePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 7f)
                curveToRelative(-5.53f, 0f, -8f, 2.47f, -8f, 8f)
                reflectiveCurveToRelative(2.47f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -2.47f, 8f, -8f)
                reflectiveCurveToRelative(-2.47f, -8f, -8f, -8f)
                close()
                moveTo(9f, 21f)
                curveToRelative(-4.43f, 0f, -6f, -1.57f, -6f, -6f)
                reflectiveCurveToRelative(1.57f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 1.57f, 6f, 6f)
                reflectiveCurveToRelative(-1.57f, 6f, -6f, 6f)
                close()
                moveTo(10.5f, 13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(5.5f, 13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(12.7f, 16.29f)
                curveToRelative(0.39f, 0.39f, 0.4f, 1.02f, 0.01f, 1.41f)
                curveToRelative(-0.86f, 0.87f, -2.07f, 1.3f, -3.71f, 1.3f)
                reflectiveCurveToRelative(-2.85f, -0.42f, -3.71f, -1.3f)
                curveToRelative(-0.39f, -0.39f, -0.38f, -1.03f, 0.01f, -1.41f)
                curveToRelative(0.4f, -0.39f, 1.03f, -0.38f, 1.41f, 0.01f)
                curveToRelative(0.47f, 0.48f, 1.2f, 0.7f, 2.29f, 0.7f)
                reflectiveCurveToRelative(1.82f, -0.22f, 2.29f, -0.7f)
                curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
                close()
                moveTo(23f, 5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SmilePlus = it}
