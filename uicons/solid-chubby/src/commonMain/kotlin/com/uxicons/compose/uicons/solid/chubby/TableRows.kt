package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableRows: ImageVector? = null

val Icons.Sc.TableRows: ImageVector
    get() = _TableRows ?: UXIcon(name = "TableRows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 2.16f)
                curveToRelative(1.15f, -0.1f, 2.48f, -0.16f, 4f, -0.16f)
                curveToRelative(6.09f, 0f, 9.19f, 1.01f, 9.32f, 1.05f)
                curveToRelative(0.32f, 0.11f, 0.57f, 0.37f, 0.65f, 0.71f)
                curveToRelative(0.04f, 0.15f, 0.87f, 3.54f, 1.01f, 7.24f)
                horizontalLineToRelative(-14.98f)
                close()
                moveTo(6f, 2.38f)
                curveToRelative(-2.13f, 0.29f, -3.24f, 0.65f, -3.32f, 0.68f)
                curveToRelative(-0.32f, 0.11f, -0.57f, 0.37f, -0.65f, 0.71f)
                curveToRelative(-0.04f, 0.17f, -1.03f, 4.17f, -1.03f, 8.24f)
                reflectiveCurveToRelative(0.99f, 8.07f, 1.03f, 8.24f)
                curveToRelative(0.08f, 0.33f, 0.33f, 0.6f, 0.65f, 0.71f)
                curveToRelative(0.08f, 0.03f, 1.19f, 0.38f, 3.32f, 0.68f)
                close()
                moveTo(8f, 13f)
                verticalLineToRelative(8.84f)
                curveToRelative(1.15f, 0.1f, 2.48f, 0.16f, 4f, 0.16f)
                curveToRelative(6.09f, 0f, 9.19f, -1.01f, 9.32f, -1.05f)
                curveToRelative(0.32f, -0.11f, 0.57f, -0.37f, 0.65f, -0.71f)
                curveToRelative(0.04f, -0.15f, 0.87f, -3.54f, 1.01f, -7.24f)
                close()
            }
        }.also { _TableRows = it}
