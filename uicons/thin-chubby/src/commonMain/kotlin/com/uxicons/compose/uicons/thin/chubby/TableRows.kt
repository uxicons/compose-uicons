package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableRows: ImageVector? = null

val Icons.Tc.TableRows: ImageVector
    get() = _TableRows ?: UXIcon(name = "TableRows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.93f, 3.44f)
                curveToRelative(-0.04f, -0.17f, -0.16f, -0.3f, -0.32f, -0.35f)
                curveToRelative(-0.13f, -0.04f, -3.26f, -1.08f, -9.61f, -1.08f)
                reflectiveCurveToRelative(-9.48f, 1.04f, -9.61f, 1.08f)
                curveToRelative(-0.16f, 0.06f, -0.28f, 0.19f, -0.32f, 0.35f)
                curveToRelative(-0.04f, 0.17f, -1.07f, 4.33f, -1.07f, 8.56f)
                reflectiveCurveToRelative(1.03f, 8.39f, 1.07f, 8.56f)
                curveToRelative(0.04f, 0.17f, 0.16f, 0.3f, 0.32f, 0.35f)
                curveToRelative(0.13f, 0.04f, 3.26f, 1.08f, 9.61f, 1.08f)
                reflectiveCurveToRelative(9.47f, -1.04f, 9.61f, -1.08f)
                curveToRelative(0.16f, -0.06f, 0.28f, -0.19f, 0.32f, -0.35f)
                curveToRelative(0.04f, -0.17f, 1.07f, -4.33f, 1.07f, -8.56f)
                reflectiveCurveToRelative(-1.03f, -8.39f, -1.07f, -8.56f)
                close()
                moveTo(21.02f, 3.95f)
                curveToRelative(0.22f, 0.95f, 0.9f, 4.21f, 0.97f, 7.55f)
                horizontalLineToRelative(-13.99f)
                verticalLineToRelative(-8.34f)
                curveToRelative(1.15f, -0.1f, 2.47f, -0.16f, 4f, -0.16f)
                curveToRelative(5.15f, 0f, 8.16f, 0.71f, 9.02f, 0.95f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -3.5f, 0.75f, -7.05f, 0.98f, -8.05f)
                curveToRelative(0.53f, -0.15f, 1.88f, -0.47f, 4.02f, -0.7f)
                verticalLineToRelative(17.5f)
                curveToRelative(-2.15f, -0.23f, -3.49f, -0.55f, -4.02f, -0.7f)
                curveToRelative(-0.23f, -1.0f, -0.98f, -4.55f, -0.98f, -8.05f)
                close()
                moveTo(21.02f, 20.05f)
                curveToRelative(-0.86f, 0.24f, -3.87f, 0.95f, -9.02f, 0.95f)
                curveToRelative(-1.53f, 0f, -2.85f, -0.07f, -4f, -0.16f)
                verticalLineToRelative(-8.34f)
                horizontalLineToRelative(13.99f)
                curveToRelative(-0.07f, 3.33f, -0.75f, 6.6f, -0.97f, 7.55f)
                close()
            }
        }.also { _TableRows = it}
