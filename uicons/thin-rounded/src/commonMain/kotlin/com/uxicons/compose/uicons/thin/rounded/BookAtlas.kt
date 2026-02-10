package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAtlas: ImageVector? = null

val Icons.Tr.BookAtlas: ImageVector
    get() = _BookAtlas ?: UXIcon(name = "BookAtlas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 0.01f)
                lineTo(6.5f, 0.01f)
                curveTo(4.02f, 0.01f, 2f, 2.03f, 2f, 4.51f)
                lineTo(2f, 20.51f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(22f, 4.51f)
                curveTo(22f, 2.03f, 19.98f, 0.01f, 17.5f, 0.01f)
                close()
                moveTo(3f, 4.51f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(12.5f)
                lineTo(5.5f, 17.01f)
                curveToRelative(-0.98f, 0f, -1.86f, 0.4f, -2.5f, 1.05f)
                lineTo(3f, 4.51f)
                close()
                moveTo(17.5f, 23.01f)
                lineTo(5.5f, 23.01f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(12f, 15f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(7.03f, 9.5f)
                horizontalLineToRelative(1.98f)
                curveToRelative(0.06f, 1.67f, 0.44f, 3.11f, 1.02f, 4.09f)
                curveToRelative(-1.63f, -0.7f, -2.82f, -2.25f, -3.0f, -4.09f)
                close()
                moveTo(12f, 4f)
                curveToRelative(0.89f, 0f, 1.88f, 1.89f, 1.99f, 4.5f)
                horizontalLineToRelative(-3.98f)
                curveToRelative(0.11f, -2.61f, 1.1f, -4.5f, 1.99f, -4.5f)
                close()
                moveTo(13.99f, 9.5f)
                curveToRelative(-0.11f, 2.61f, -1.1f, 4.5f, -1.99f, 4.5f)
                reflectiveCurveToRelative(-1.88f, -1.89f, -1.99f, -4.5f)
                horizontalLineToRelative(3.98f)
                close()
                moveTo(13.97f, 13.59f)
                curveToRelative(0.58f, -0.99f, 0.96f, -2.42f, 1.02f, -4.09f)
                horizontalLineToRelative(1.98f)
                curveToRelative(-0.18f, 1.84f, -1.37f, 3.39f, -3.0f, 4.09f)
                close()
                moveTo(16.98f, 8.5f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-0.06f, -1.67f, -0.44f, -3.11f, -1.02f, -4.09f)
                curveToRelative(1.63f, 0.7f, 2.82f, 2.25f, 3.0f, 4.09f)
                close()
                moveTo(10.03f, 4.41f)
                curveToRelative(-0.58f, 0.99f, -0.96f, 2.42f, -1.02f, 4.09f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(0.18f, -1.84f, 1.37f, -3.39f, 3.0f, -4.09f)
                close()
            }
        }.also { _BookAtlas = it}
