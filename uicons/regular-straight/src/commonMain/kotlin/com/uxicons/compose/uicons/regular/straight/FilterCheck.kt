package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterCheck: ImageVector? = null

val Icons.Rs.FilterCheck: ImageVector
    get() = _FilterCheck ?: UXIcon(name = "FilterCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 14.48f)
                curveToRelative(0.62f, 0.41f, 1.29f, 0.74f, 2f, 0.99f)
                verticalLineToRelative(8.52f)
                lineToRelative(-6f, -4.5f)
                verticalLineToRelative(-5.12f)
                lineToRelative(-8f, -9f)
                verticalLineToRelative(-2.38f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8.35f)
                curveToRelative(-0.71f, 0.57f, -1.32f, 1.24f, -1.83f, 2f)
                horizontalLineToRelative(-6.52f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.62f)
                lineToRelative(8f, 9f)
                verticalLineToRelative(4.88f)
                lineToRelative(2f, 1.5f)
                close()
                moveTo(24f, 7f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(19.59f, 4.69f)
                lineTo(16.36f, 7.87f)
                lineTo(14.73f, 6.29f)
                lineTo(13.34f, 7.72f)
                lineTo(15.18f, 9.51f)
                curveToRelative(0.31f, 0.32f, 0.73f, 0.49f, 1.18f, 0.49f)
                reflectiveCurveToRelative(0.86f, -0.17f, 1.17f, -0.48f)
                lineToRelative(3.46f, -3.4f)
                lineToRelative(-1.4f, -1.43f)
                close()
            }
        }.also { _FilterCheck = it}
