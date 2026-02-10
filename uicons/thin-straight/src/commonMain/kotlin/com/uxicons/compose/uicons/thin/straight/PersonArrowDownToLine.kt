package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonArrowDownToLine: ImageVector? = null

val Icons.Ts.PersonArrowDownToLine: ImageVector
    get() = _PersonArrowDownToLine ?: UXIcon(name = "PersonArrowDownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(7.88f, 0f, 6.5f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(6.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(17.46f, 19.57f)
                lineToRelative(-3.42f, -3.42f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.25f, 3.25f)
                lineTo(18f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(15.69f)
                lineToRelative(3.25f, -3.25f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.42f, 3.42f)
                curveToRelative(-0.57f, 0.57f, -1.5f, 0.57f, -2.07f, 0f)
                close()
                moveTo(9f, 23f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                lineTo(11f, 8.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4.5f, 6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                lineTo(24f, 24f)
                verticalLineToRelative(-1f)
                lineTo(9f, 23f)
                close()
                moveTo(3f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                lineTo(3f, 16f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _PersonArrowDownToLine = it}
