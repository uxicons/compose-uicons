package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dewpoint: ImageVector? = null

val Icons.Sc.Dewpoint: ImageVector
    get() = _Dewpoint ?: UXIcon(name = "Dewpoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.05f, 7.14f)
                curveToRelative(-2.55f, 0f, -3.09f, -1.67f, -3.09f, -3.07f)
                reflectiveCurveToRelative(0.54f, -3.07f, 3.09f, -3.07f)
                reflectiveCurveToRelative(3.09f, 1.67f, 3.09f, 3.07f)
                reflectiveCurveToRelative(-0.54f, 3.07f, -3.09f, 3.07f)
                close()
                moveTo(19.05f, 3f)
                curveToRelative(-0.87f, 0f, -1.09f, 0.13f, -1.09f, 1.07f)
                reflectiveCurveToRelative(0.22f, 1.07f, 1.09f, 1.07f)
                reflectiveCurveToRelative(1.09f, -0.13f, 1.09f, -1.07f)
                reflectiveCurveToRelative(-0.22f, -1.07f, -1.09f, -1.07f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.91f, 4.07f)
                curveToRelative(-0.31f, -0.17f, -0.69f, -0.17f, -0.99f, 0.01f)
                curveToRelative(-0.33f, 0.19f, -7.96f, 4.73f, -8.06f, 10.37f)
                curveToRelative(0.13f, 4.33f, 4.28f, 8.48f, 8.58f, 8.54f)
                curveToRelative(4.27f, -0.06f, 8.55f, -4.21f, 8.55f, -8.54f)
                curveToRelative(0f, -5.89f, -7.75f, -10.2f, -8.08f, -10.38f)
                close()
            }
        }.also { _Dewpoint = it}
