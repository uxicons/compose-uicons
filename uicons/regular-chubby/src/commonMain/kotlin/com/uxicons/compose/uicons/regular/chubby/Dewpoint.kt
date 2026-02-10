package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dewpoint: ImageVector? = null

val Icons.Rc.Dewpoint: ImageVector
    get() = _Dewpoint ?: UXIcon(name = "Dewpoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.91f, 4.07f)
                curveToRelative(-0.31f, -0.17f, -0.69f, -0.17f, -0.99f, 0.01f)
                curveToRelative(-0.33f, 0.19f, -7.96f, 4.73f, -8.06f, 10.37f)
                curveToRelative(0.13f, 4.33f, 4.28f, 8.48f, 8.58f, 8.54f)
                curveToRelative(4.27f, -0.06f, 8.55f, -4.43f, 8.55f, -8.54f)
                curveToRelative(0f, -5.68f, -7.75f, -10.2f, -8.08f, -10.38f)
                close()
                moveTo(10.44f, 21f)
                curveToRelative(-3.22f, -0.04f, -6.48f, -3.32f, -6.58f, -6.56f)
                curveToRelative(0.06f, -3.76f, 4.98f, -7.28f, 6.58f, -8.32f)
                curveToRelative(1.59f, 0.99f, 6.46f, 4.34f, 6.55f, 8.3f)
                curveToRelative(-0.11f, 3.28f, -3.36f, 6.54f, -6.55f, 6.58f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.05f, 1f)
                curveToRelative(-2.55f, 0f, -3.09f, 1.67f, -3.09f, 3.07f)
                reflectiveCurveToRelative(0.54f, 3.07f, 3.09f, 3.07f)
                reflectiveCurveToRelative(3.09f, -1.67f, 3.09f, -3.07f)
                reflectiveCurveToRelative(-0.54f, -3.07f, -3.09f, -3.07f)
                close()
                moveTo(19.05f, 5.14f)
                curveToRelative(-0.87f, 0f, -1.09f, -0.13f, -1.09f, -1.07f)
                reflectiveCurveToRelative(0.22f, -1.07f, 1.09f, -1.07f)
                reflectiveCurveToRelative(1.09f, 0.13f, 1.09f, 1.07f)
                reflectiveCurveToRelative(-0.22f, 1.07f, -1.09f, 1.07f)
                close()
            }
        }.also { _Dewpoint = it}
