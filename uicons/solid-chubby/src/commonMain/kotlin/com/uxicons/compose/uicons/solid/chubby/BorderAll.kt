package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BorderAll: ImageVector? = null

val Icons.Sc.BorderAll: ImageVector
    get() = _BorderAll ?: UXIcon(name = "BorderAll") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.02f, 3.13f)
                curveToRelative(-0.12f, -0.57f, -0.57f, -1.02f, -1.14f, -1.14f)
                curveToRelative(-0.18f, -0.04f, -4.54f, -0.98f, -8.87f, -0.98f)
                reflectiveCurveToRelative(-8.69f, 0.95f, -8.87f, 0.99f)
                curveToRelative(-0.57f, 0.12f, -1.02f, 0.57f, -1.14f, 1.14f)
                curveToRelative(-0.04f, 0.18f, -0.98f, 4.54f, -0.98f, 8.87f)
                reflectiveCurveToRelative(0.94f, 8.69f, 0.98f, 8.87f)
                curveToRelative(0.12f, 0.57f, 0.57f, 1.02f, 1.14f, 1.14f)
                curveToRelative(0.18f, 0.04f, 4.54f, 0.98f, 8.87f, 0.98f)
                reflectiveCurveToRelative(8.69f, -0.94f, 8.87f, -0.98f)
                curveToRelative(0.57f, -0.12f, 1.02f, -0.57f, 1.14f, -1.14f)
                curveToRelative(0.04f, -0.18f, 0.98f, -4.54f, 0.98f, -8.87f)
                reflectiveCurveToRelative(-0.94f, -8.69f, -0.98f, -8.87f)
                close()
                moveTo(19.96f, 10.5f)
                horizontalLineToRelative(-6.46f)
                verticalLineToRelative(-6.46f)
                curveToRelative(2.34f, 0.12f, 4.56f, 0.47f, 5.77f, 0.69f)
                curveToRelative(0.22f, 1.21f, 0.57f, 3.43f, 0.69f, 5.77f)
                close()
                moveTo(10.5f, 4.04f)
                verticalLineToRelative(6.46f)
                horizontalLineToRelative(-6.46f)
                curveToRelative(0.12f, -2.34f, 0.47f, -4.56f, 0.69f, -5.77f)
                curveToRelative(1.21f, -0.22f, 3.43f, -0.57f, 5.77f, -0.69f)
                close()
                moveTo(4.04f, 13.5f)
                horizontalLineToRelative(6.46f)
                verticalLineToRelative(6.46f)
                curveToRelative(-2.34f, -0.12f, -4.56f, -0.47f, -5.77f, -0.69f)
                curveToRelative(-0.22f, -1.21f, -0.57f, -3.43f, -0.69f, -5.77f)
                close()
                moveTo(13.5f, 19.96f)
                verticalLineToRelative(-6.46f)
                horizontalLineToRelative(6.46f)
                curveToRelative(-0.12f, 2.34f, -0.47f, 4.56f, -0.69f, 5.77f)
                curveToRelative(-1.21f, 0.22f, -3.43f, 0.57f, -5.77f, 0.69f)
                close()
            }
        }.also { _BorderAll = it}
