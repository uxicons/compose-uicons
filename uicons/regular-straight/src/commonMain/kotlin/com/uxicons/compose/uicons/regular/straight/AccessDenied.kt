package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AccessDenied: ImageVector? = null

val Icons.Rs.AccessDenied: ImageVector
    get() = _AccessDenied ?: UXIcon(name = "AccessDenied") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10f)
                curveToRelative(-2.79f, 0f, -5.19f, 1.64f, -6.32f, 4f)
                horizontalLineToRelative(-1.69f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1.08f)
                curveToRelative(0.49f, 3.39f, 3.4f, 6f, 6.92f, 6f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(19.96f, 15.46f)
                lineTo(18.41f, 17f)
                lineTo(19.96f, 18.54f)
                lineTo(18.54f, 19.96f)
                lineTo(17f, 18.41f)
                lineTo(15.46f, 19.96f)
                lineTo(14.04f, 18.54f)
                lineTo(15.59f, 17f)
                lineTo(14.04f, 15.46f)
                lineTo(15.46f, 14.04f)
                lineTo(17f, 15.59f)
                lineTo(18.54f, 14.04f)
                close()
                moveTo(9.52f, 22f)
                horizontalLineToRelative(-6.52f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(9.35f)
                curveToRelative(1.54f, -1.25f, 3.51f, -2f, 5.65f, -2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8.35f)
                curveToRelative(-0.71f, -0.57f, -1.32f, -1.24f, -1.83f, -2f)
                close()
                moveTo(5f, 7f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.also { _AccessDenied = it}
