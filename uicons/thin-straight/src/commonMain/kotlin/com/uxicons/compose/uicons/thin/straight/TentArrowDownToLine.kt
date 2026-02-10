package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowDownToLine: ImageVector? = null

val Icons.Ts.TentArrowDownToLine: ImageVector
    get() = _TentArrowDownToLine ?: UXIcon(name = "TentArrowDownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.68f, 20.81f)
                lineTo(14.0f, 6.15f)
                lineTo(2.73f, 23f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(21.84f)
                curveToRelative(0.8f, 0f, 1.5f, -0.41f, 1.89f, -1.09f)
                curveToRelative(0.37f, -0.66f, 0.36f, -1.44f, -0.05f, -2.1f)
                close()
                moveTo(10.97f, 23.0f)
                lineToRelative(3.03f, -4.59f)
                lineToRelative(3.03f, 4.59f)
                horizontalLineToRelative(-6.07f)
                close()
                moveTo(22.86f, 22.42f)
                curveToRelative(-0.2f, 0.36f, -0.58f, 0.58f, -1.02f, 0.58f)
                horizontalLineToRelative(-3.61f)
                reflectiveCurveToRelative(-4.23f, -6.41f, -4.23f, -6.41f)
                lineToRelative(-4.23f, 6.41f)
                lineTo(3.94f, 23.0f)
                reflectiveCurveTo(14.0f, 7.96f, 14.0f, 7.96f)
                lineToRelative(8.84f, 13.39f)
                curveToRelative(0.21f, 0.34f, 0.21f, 0.73f, 0.02f, 1.07f)
                close()
                moveTo(3.45f, 8.57f)
                lineTo(0.15f, 5.27f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.15f, 3.15f)
                lineTo(4f, 0.0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7.7f)
                lineToRelative(3.15f, -3.14f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.29f, 0.29f, -0.67f, 0.43f, -1.05f, 0.43f)
                reflectiveCurveToRelative(-0.76f, -0.14f, -1.05f, -0.43f)
                close()
            }
        }.also { _TentArrowDownToLine = it}
